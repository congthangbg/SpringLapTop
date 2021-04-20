import React, { Component, useState } from 'react';
import ApiCaller from '../AxiosUtils/ApiCaller';
function CreateProduct({ item, setItem, data, setData, laptop, setLaptop }) {
   const [state, setState] = useState("")
   // const [data, setData] = useState({username: '',password:"",status: ''})
   const onChangHandler = (event) => {
      const name = event.target.name;
      const value = event.target.value
      setData({
         ...data,
         [name]: value,
      })
   }
   const addLaptop = (event) => {
      setItem(true)//thay đổi giá trị item tai state ListProduct
      event.preventDefault();
      // console.log("user =>" + JSON.stringify(data));
      ApiCaller("laptop", "POST", data).then((response) => {

      })
      const itemInsert = setLaptop([
         ...laptop,
         data
      ]);
      console.log(laptop);
      clear();
   }
   const updateLaptop = (event, id) => {
      setItem(true)//thay đổi giá trị item tai state ListProduct
      event.preventDefault();
      ApiCaller("laptop/" + id, "PUT", data).then((response) => {
         console.log(response.data);
      })
      clear();
   }

   const deleteLaptop = (event, id) => {
      setItem(true)//thay đổi giá trị item tai state ListProduct
      event.preventDefault();
      console.log(laptop);
      ApiCaller("laptop/" + id, "DELETE", data).then((response) => {
      })
      const itemDelete = laptop.filter(item => item.id !== id);
      setLaptop(itemDelete)
      clear();
   }
   const clear = () => {
      setData({ id: "", lapTopName: '', price: "", amount: '' });
   }
   console.log(data);
   return (
      <form>
         <div className="form-row">
            <div className="col-6 row mt-3">
               <label htmlFor="inputEmail3" className="col-md-3 col-form-label">Phân loại</label>
               <div className="col-md-5" >
                  <select className=" browser-default custom-select " name="description" onChange={onChangHandler}  >
                     <option>Laptop Gaming</option>
                     <option>Laptop văn phòng</option>
                  </select>
               </div>
            </div>
            <div className="col-6 row mt-3">
               <label htmlFor="inputEmail3" className="col-md-3 col-form-label">Hãng</label>
               <div className="col-md-9" >
                  <select className=" browser-default custom-select "  name="description" onChange={onChangHandler}  >
                     <option>Asus</option>
                     <option>Mac</option>
                     <option>Dell</option>
                  </select>
               </div>
            </div>
         </div>

         <div className="form-row">
            <div className="col-6 row mt-3">
               <label htmlFor="inputEmail3" className="col-md-3 col-form-label">Tên Laptop</label>
               <div className="col-md-8" >
                  <input type="text" className="form-control" id="inputEmail3" aria-describedby="inputEmail3" placeholder="Tên laptop" />
               </div>
            </div>
            <div className="col-6 row mt-3">
               <label htmlFor="dongia" className="col-md-3 col-form-label">Đơn giá</label>
               <div className="col-md-9" >
                  <input type="text" className="form-control" id="dongia" aria-describedby="dongia" placeholder="Đơn giá" />
               </div>
            </div>
         </div>

         <div className="form-row">
            <div className="col-12 row mt-3">
               <label htmlFor="image" className="col-1 col-form-label">Image</label>
               <div className="col-md-9"  >
                  <input type="text" className="form-control ml-5" id="image"  placeholder="url" />
               </div>
            </div>
         </div>

         <fieldset class="scheduler-border">
            <legend class="scheduler-border">Thông tin chi tiết Laptop</legend>
            <div className="form-row">
            <div className="col-6 row mt-3">
               <div className="col-11" >
                  <input type="text" className="form-control height" id="inputEmail3" aria-describedby="inputEmail3" placeholder="CPU" />
               </div>
            </div>
            <div className="col-6 row mt-4 height">
            <label htmlFor="ram" className="col-md-3 col-form-label">RAM</label>
               <div className="col-md-5" >
                  <select className=" browser-default custom-select "  name="description" onChange={onChangHandler}  >
                     <option>4 GB</option>
                     <option>8 GB</option>
                     <option>16 GB</option>
                     <option>32 GB</option>
                     <option>64 GB</option>
                  </select>
               </div>
            </div>
         </div>

         <div className="form-row">
            <div className="col-6 row ">
               <div className="col-11" >
                  <input type="text"  className="form-control height" id="inputEmail3"  placeholder="ROM" />
               </div>
            </div>
            <div className="col-6 row mt-3">
            <label htmlFor="card"  className="col-md-3 col-form-label">CARD</label>
               <div className="col-md-9" >
                  <select className=" browser-default custom-select "  name="description" onChange={onChangHandler}  >
                     <option>VGA MSI GT710 1GD3H LP (NVIDIA Geforce/ 1Gb/ DDR3/ 128Bit)</option>
                     <option>VGA ASUS Phoenix Radeon RX 550 4GB GDDR5 (PH-RX550-4G-EVO)</option>
                  </select>
               </div>
            </div>
         </div>

         <div className="form-row">
            <div className="col-6 row ">
               <div className="col-11" >
                  <input type="text"  className="form-control height" id="inputEmail3"  placeholder="Bàn phím" />
               </div>
            </div>
            <div className="col-6 row mt-3">
            <label htmlFor="card"  className="col-md-3 col-form-label">Màn hình</label>
               <div className="col-md-8" >
                  <select className=" browser-default custom-select "  name="description" onChange={onChangHandler}  >
                     <option>15.6 inch</option>
                     <option>13 inch</option>
                  </select>
               </div>
            </div>
         </div>

         <div className="form-row">
            <div className="col-6 row ">
               <div className="col-11" >
                  <input type="text"  className="form-control height" id="inputEmail3"  placeholder="Hệ điều hành" />
               </div>
            </div>
            <div className="col-6 row ">
               <div className="col-11" >
                  <input type="text"  className="form-control height" id="inputEmail3"  placeholder="Pin" />
               </div>
            </div>
         </div>

         <div className="form-row">
            <div className="col-6 row ">
               <div className="col-11" >
                  <input type="text"  className="form-control height" id="inputEmail3"  placeholder="Màu" />
               </div>
            </div>
            <div className="col-6 row ">
               <div className="col-11" >
                  <input type="text"  className="form-control height" id="inputEmail3"  placeholder="Kích thước" />
               </div>
            </div>
         </div>

         <div className="form-row">
            <div className="col-6 row ">
               <div className="col-11" >
                  <input type="text"  className="form-control height" id="inputEmail3"  placeholder="Cổng kết nối" />
               </div>
            </div>
            <div className="col-6 row ">
               <div className="col-11" >
                  <input type="text"  className="form-control height" id="inputEmail3"  placeholder="Cân nặng" />
               </div>
            </div>
         </div>

         <div className="form-row">
            <div className="col-6 row ">
               <div className="col-11" >
                  <input type="text"  className="form-control height" id="inputEmail3"  placeholder="Camera" />
               </div>
            </div>
            <div className="col-6 row ">
               <div className="col-11" >
                  <input type="text"  className="form-control height" id="inputEmail3"  placeholder="Phụ kiện đi kèm" />
               </div>
            </div>
         </div>

         <div className="form-row">
            <div className="col-6 row ">
               <div className="col-11" >
                  <input type="text"  className="form-control height" id="inputEmail3"  placeholder="Audio" />
               </div>
            </div>
            <div className="col-6 row ">
               <div className="col-11" >
                  <input type="text"  className="form-control height" id="inputEmail3"  placeholder="Năm sản xuất" />
               </div>
            </div>
         </div>
         </fieldset>

         <div className="form-group row text-center">
            <div className="col-md-12 ">
            <button type="submit" className="btn btn-success " onClick={(event) =>addLaptop(event)} >Thêm</button>
            <button type="submit" className="btn btn-warning " onClick={(event) =>updateLaptop(event,data.id)}>Sửa</button>
            <button type="submit" className="btn btn-danger " onClick={(event) =>deleteLaptop(event,data.id)}>Xóa</button>
               <button type="button" className="btn btn-primary ml-3" onClick={clear}>Clear</button>
            </div>
         </div>

      </form>
   );
}

export default CreateProduct;
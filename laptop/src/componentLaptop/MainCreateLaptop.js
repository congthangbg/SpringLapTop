import React, { useState } from 'react';
import ApiCaller from '../AxiosUtils/ApiCaller';
function CreateProduct({ setItem,
   laptop, setLaptop,
   brand, type
}) {

   const [brand1, setBrand1] = useState({ id: "", brandName: '' })
   const [type1, setType1] = useState({ id: "", typeName: '' })
   const [laptopDetail, setLaptopDetail] = useState({
      id: "",
      cpu: "", rom: "", keyBoard: "", system: "", color: "", connector: "", camera: "",
      audio: "", pin: "", size: "", weight: "", component: "", year: "", screentypes: [], ramtypes: []
   })
   //const [laptopDetail, setLaptopDetail] = useState("")
   const [dataLaptop, setDataLaptop] = useState({ brand: brand1, image: "", lapTopName: '', price: "", type: type1, laptopDetail: laptopDetail })


   const changeCbo = (event) => {
      const value = event.target.value;

      brand.map((val, index) => {
         if (val.id == value) {
            setBrand1(val)

         }
      })
      type.map((val, index) => {
         if (val.id == value) {
            setType1(val)
         }
      })
   }
   
   const onChangHandler = (event) => {
      const name = event.target.name;
      const value = event.target.value
      setDataLaptop({
         ...dataLaptop,
         [name]: value,
         brand: brand1,
         type: type1,
         laptopDetail: laptopDetail
      })

   }

   const onChangLaptopDetail = (event) => {
      const name = event.target.name;
      const value = event.target.value

      setLaptopDetail({

         ...laptopDetail,
         [name]: value,


      })

      setDataLaptop({
         ...dataLaptop,
         laptopDetail: laptopDetail
      })

   }


   const addLaptop = (event) => {

      event.preventDefault();
      // console.log("user =>" + JSON.stringify(dataLaptop));
      ApiCaller("laptop", "POST", dataLaptop).then((response) => {

      })
      const itemInsert = setLaptop([
         ...laptop,
         dataLaptop
      ]);

      clear();
   }
   const updateLaptop = (event, id) => {
      setItem(true)//thay đổi giá trị item tai state ListProduct
      event.preventDefault();
      ApiCaller("laptop/" + id, "PUT", dataLaptop).then((response) => {
         console.log(response.data);
      })
      clear();
   }

   const deleteLaptop = (event, id) => {
      setItem(true)//thay đổi giá trị item tai state ListProduct
      event.preventDefault();

      ApiCaller("laptop/" + id, "DELETE", dataLaptop).then((response) => {
      })
      const itemDelete = laptop.filter(item => item.id !== id);
      setLaptop(itemDelete)
      clear();
   }
   const clear = () => {
      setDataLaptop({ id: "", lapTopName: '', price: "", image: '' });
   }
   console.log(dataLaptop);
   return (
      <form>
         <div className="form-row">
            <div className="col-6 row mt-3">
               <label htmlFor="phanloai" className="col-md-3 col-form-label">Phân loại</label>
               <div className="col-md-5" >
                  <select className=" browser-default custom-select " name="type" onChange={changeCbo}  >
                     {
                        type ? type.map((value, index) => {
                           return (
                              <option key={index} value={value.id} >{value.typeName}</option>
                           )
                        }) : ""
                     }
                  </select>
               </div>
            </div>
            <div className="col-6 row mt-3">
               <label htmlFor="hang" className="col-md-3 col-form-label">Hãng</label>
               <div className="col-md-9" >
                  <select className=" browser-default custom-select " name="brand" onChange={changeCbo}  >
                     {
                        brand ? brand.map((value, index) => {
                           return (
                              <option value={value.id} key={index}>{value.brandName}</option>
                           )
                        }) : ""
                     }
                  </select>
               </div>
            </div>
         </div>

         <div className="form-row">
            <div className="col-6 row mt-3">
               <label htmlFor="tenlaptop" className="col-md-3 col-form-label">Tên Laptop</label>
               <div className="col-md-8" >
                  <input type="text" className="form-control" onChange={onChangHandler} name="lapTopName" id="tenlaptop" aria-describedby="tenlaptop" placeholder="Tên laptop" />
               </div>
            </div>
            <div className="col-6 row mt-3">
               <label htmlFor="dongia" className="col-md-3 col-form-label">Đơn giá</label>
               <div className="col-md-9" >
                  <input type="text" className="form-control" name="price" onChange={onChangHandler} id="dongia" aria-describedby="dongia" placeholder="Đơn giá" />
               </div>
            </div>
         </div>

         <div className="form-row">
            <div className="col-12 row mt-3">
               <label htmlFor="image" className="col-1 col-form-label">Image</label>
               <div className="col-md-9"  >
                  <input type="text" className="form-control ml-5" onChange={onChangHandler} name="image" id="image" placeholder="url" />
               </div>
            </div>
         </div>

         <fieldset className="scheduler-border">
            <legend className="scheduler-border">Thông tin chi tiết Laptop</legend>
            <div className="form-row">
               <div className="col-6 row mt-3">
                  <div className="col-11" >
                     <input type="text" className="form-control height" onChange={onChangLaptopDetail} name="cpu" id="cpu" aria-describedby="cpu" placeholder="CPU" />
                  </div>
               </div>
               <div className="col-6 row mt-4 height">
                  <label htmlFor="ram" className="col-md-3 col-form-label">RAM</label>
                  <div className="col-md-5" >
                     <select className=" browser-default custom-select " name="ramtypes" onChange={onChangLaptopDetail}  >
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
                     <input type="text" className="form-control height" onChange={onChangLaptopDetail} name="rom" id="rom" placeholder="ROM" />
                  </div>
               </div>
               <div className="col-6 row mt-3">
                  <label htmlFor="card" className="col-md-3 col-form-label">CARD</label>
                  <div className="col-md-9" >
                     <select className=" browser-default custom-select " name="cardType" onChange={onChangLaptopDetail}  >
                        <option>VGA MSI GT710 1GD3H LP (NVIDIA Geforce/ 1Gb/ DDR3/ 128Bit)</option>
                        <option>VGA ASUS Phoenix Radeon RX 550 4GB GDDR5 (PH-RX550-4G-EVO)</option>
                     </select>
                  </div>
               </div>
            </div>

            <div className="form-row">
               <div className="col-6 row ">
                  <div className="col-11" >
                     <input type="text" className="form-control height" onChange={onChangLaptopDetail} name="keyBoard" id="banphim" placeholder="Bàn phím" />
                  </div>
               </div>
               <div className="col-6 row mt-3">
                  <label htmlFor="card" className="col-md-3 col-form-label">Màn hình</label>
                  <div className="col-md-8" >
                     <select className=" browser-default custom-select " name="screentypes" onChange={onChangLaptopDetail}  >
                        <option>15.6 inch</option>
                        <option>13 inch</option>
                     </select>
                  </div>
               </div>
            </div>

            <div className="form-row">
               <div className="col-6 row ">
                  <div className="col-11" >
                     <input type="text" className="form-control height" id="system" name="system" onChange={onChangLaptopDetail} placeholder="Hệ điều hành" />
                  </div>
               </div>
               <div className="col-6 row ">
                  <div className="col-11" >
                     <input type="text" className="form-control height" id="pin" name="pin" onChange={onChangLaptopDetail} placeholder="Pin" />
                  </div>
               </div>
            </div>

            <div className="form-row">
               <div className="col-6 row ">
                  <div className="col-11" >
                     <input type="text" className="form-control height" id="mau" name="color" onChange={onChangLaptopDetail} placeholder="Màu" />
                  </div>
               </div>
               <div className="col-6 row ">
                  <div className="col-11" >
                     <input type="text" className="form-control height" id="kichthuoc" name="size" onChange={onChangLaptopDetail} placeholder="Kích thước" />
                  </div>
               </div>
            </div>

            <div className="form-row">
               <div className="col-6 row ">
                  <div className="col-11" >
                     <input type="text" className="form-control height" name="connector" id="congketnoi" onChange={onChangLaptopDetail} placeholder="Cổng kết nối" />
                  </div>
               </div>
               <div className="col-6 row ">
                  <div className="col-11" >
                     <input type="text" className="form-control height" id="cannang" name="weight" onChange={onChangLaptopDetail} placeholder="Cân nặng" />
                  </div>
               </div>
            </div>

            <div className="form-row">
               <div className="col-6 row ">
                  <div className="col-11" >
                     <input type="text" className="form-control height" id="camera" name="camera" onChange={onChangLaptopDetail} placeholder="Camera" />
                  </div>
               </div>
               <div className="col-6 row ">
                  <div className="col-11" >
                     <input type="text" className="form-control height" id="pk" name="component" onChange={onChangLaptopDetail} placeholder="Phụ kiện đi kèm" />
                  </div>
               </div>
            </div>

            <div className="form-row">
               <div className="col-6 row ">
                  <div className="col-11" >
                     <input type="text" className="form-control height" id="audio" name="audio" onChange={onChangLaptopDetail} placeholder="Audio" />
                  </div>
               </div>
               <div className="col-6 row ">
                  <div className="col-11" >
                     <input type="text" className="form-control height" id="namsx" name="year" onChange={onChangLaptopDetail} placeholder="Năm sản xuất" />
                  </div>
               </div>
            </div>
         </fieldset>

         <div className="form-group row text-center">
            <div className="col-md-12 ">
               <button type="submit" className="btn btn-success " onClick={(event) => addLaptop(event)} >Thêm</button>
               <button type="submit" className="btn btn-warning " onClick={(event) => updateLaptop(event, dataLaptop.id)}>Sửa</button>
               <button type="submit" className="btn btn-danger " onClick={(event) => deleteLaptop(event, dataLaptop.id)}>Xóa</button>
               <button type="button" className="btn btn-primary ml-3" onClick={clear}>Clear</button>
            </div>
         </div>

      </form>
   );
}

export default CreateProduct;
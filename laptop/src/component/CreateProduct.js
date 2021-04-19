import React, { Component, useState } from 'react';
import ApiCaller from '../AxiosUtils/ApiCaller';
function CreateProduct({item,data,setData,laptop,setLaptop}) {
   const [state,setState]=useState("")
  // const [data, setData] = useState({username: '',password:"",status: ''})
   const onChangHandler = (event) => {
      const name = event.target.name;
      const value = event.target.value 
      setData({
         ...data,
         [name]: value,
      })
   }
   const addLaptop =(event)=>{
      event.preventDefault();
      // console.log("user =>" + JSON.stringify(data));
      ApiCaller("laptop","POST",data).then((response)=>{
      
      })
      const itemInsert = setLaptop([
         ...laptop,
         data
      ]);
      console.log(laptop);
      clear();
   }
   const updateLaptop=(event,id)=>{
    event.preventDefault();   
    ApiCaller("laptop/"+id,"PUT",data).then((response)=>{
      console.log(response.data);
   })
clear();
   }
  
   const deleteLaptop = (event,id)=>{
      event.preventDefault();
      console.log(laptop);
      ApiCaller("laptop/"+id,"DELETE",data).then((response)=>{
      })
      const itemDelete = laptop.filter(item => item.id !== id);
      setLaptop(itemDelete)
      clear();
   }
   const clear=() => {
      setData({ id:"",lapTopName: '',price:"",amount: ''});
   }
   console.log(data);
   return (
      <form className="mt-4" style={{ marginLeft: 150 }}>
         <div className="row mt-2">
            <label htmlFor="inputEmail3" className="col-md-2 col-form-label">ID</label>
            <div className="col-md-8">
               <input disabled name="id" type="input" className="form-control"  onChange={onChangHandler}   value={data.id} placeholder="Id" />
            </div>
         </div>
         <div className=" row mt-2">
            <label htmlFor="inputEmail3" className="col-md-2 col-form-label">Tên Laptop</label>
            <div className="col-md-8">
               <input name="lapTopName" type="input" onChange={onChangHandler} value={data.lapTopName}  className="form-control" placeholder="Tên " />
            </div>
         </div>
         <div className=" row mt-2">
            <label htmlFor="inputEmail3" className="col-md-2 col-form-label">Số lượng</label>
            <div className="col-md-8">
               <input name="amount" type="input"  onChange={onChangHandler} value={data.amount}  className="form-control" />
            </div>
         </div>
         <div className=" row mt-2">
            <label htmlFor="inputEmail3" className="col-md-2 col-form-label">Giá</label>
            <div className="col-md-8">
               <input name="price" type="input"  onChange={onChangHandler} value={data.price}  className="form-control" />
            </div>
         </div>

         <div className="form-group row">
            <div className="col-md-10 ml-auto">
            <button type="submit" className="btn btn-success " onClick={(event) =>addLaptop(event)} >Thêm</button>
            <button type="submit" className="btn btn-warning " onClick={(event) =>updateLaptop(event,data.id)}>Sửa</button>
            <button type="submit" className="btn btn-danger " onClick={(event) =>deleteLaptop(event,data.id)}>Xóa</button>
               <button type="button" className="btn btn-primary ml-3" onClick={clear}>Clear</button>
               {/* <button onClick={()=>handleDelete(data.id)} type="submit" className="btn btn-primary ml-3">Xoá</button> */}
            </div>
         </div>
      </form>
   );
}

export default CreateProduct;
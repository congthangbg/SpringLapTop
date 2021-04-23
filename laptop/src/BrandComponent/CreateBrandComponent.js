import React, { Component, useState } from 'react';
import ApiCaller from '../AxiosUtils/ApiCaller';

function CreateBrandComponent({dataBrand,setdataBrand,brand,setBrand}) {

    const onChangHandler = (event) => {
        const name = event.target.name;
        const value = event.target.value
        setdataBrand({
            ...dataBrand,
            [name]: value,
        })
    }

    const addBrand = (event) =>{
        event.preventDefault();
        ApiCaller("brand","POST",dataBrand).then((response) => {

        })

        const itemInsert = setBrand([
            ...brand,
            dataBrand
        ]);
        console.log(brand);
        clear();
    }

    const updateBrand=(event,id)=>{
        event.preventDefault();
        ApiCaller("brand/" + id,"PUT", dataBrand).then((response) => {
            console.log(response.data);
        })
        clear();
    }

    const deleteBrand = (event,id)=>{
        event.preventDefault();
        console.log(brand);
        ApiCaller("brand/" + id,"DELETE", dataBrand).then((response) => {

        })

        const itemDelete = brand.filter(item => item.id !== id);
        setBrand(itemDelete)
        clear();
    }

    const clear = () => {
      setdataBrand({ id:"",brandName:""});
    }
    console.log(dataBrand);
    return (
        <form className="mt-4" style={{ marginLeft: 150 }}>
           <div className="row mt-2">
              <label htmlFor="inputEmail3" className="col-md-2 col-form-label">ID</label>
              <div className="col-md-8">
                 <input disabled name="id"  type="input" className="form-control"  onChange={onChangHandler} value={dataBrand.id || ''}  />
              </div>
           </div>
           <div className=" row mt-2">
              <label htmlFor="inputEmail3" className="col-md-2 col-form-label">Hãng laptop</label>
              <div className="col-md-8">
                 <input name="brandName" type="input" onChange={onChangHandler}   className="form-control" value={dataBrand.brandName || ''} />
              </div>
           </div>
  
           <div className="form-group row">
              <div className="col-md-10 ml-auto">
              <button type="submit" className="btn btn-success " onClick={(event) =>addBrand(event)} >Thêm</button>
              <button type="submit" className="btn btn-warning " onClick={(event) =>updateBrand(event,dataBrand.id)}>Sửa</button>
              <button type="submit" className="btn btn-danger " onClick={(event) =>deleteBrand(event,dataBrand.id)}>Xóa</button>
                 <button type="button" className="btn btn-primary ml-3" onClick={clear}>Clear</button>
              </div>
           </div>
        </form>
     );
}

export default CreateBrandComponent;
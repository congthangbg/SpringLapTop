import React, { Component, useState } from 'react';
import ApiCaller from '../AxiosUtils/ApiCaller';

function CreateTypeComponent({dataType,setdataType,type,setType}) {

    const onChangHandler = (event) => {
        const name = event.target.name;
        const value = event.target.value
        setdataType({
            ...dataType,
            [name]: value,
        })
    }

    const addType = (event) =>{
        event.preventDefault();
        ApiCaller("type","POST",dataType).then((response) => {

        })

        const itemInsert = setType([
            ...type,
            dataType
        ]);
        console.log(type);
        clear();
    }

    const updateType=(event,id)=>{
        event.preventDefault();
        ApiCaller("type/" + id,"PUT", dataType).then((response) => {
            console.log(response.data);
        })
        clear();
    }

    const deleteType = (event,id)=>{
        event.preventDefault();
        console.log(type);
        ApiCaller("type/" + id,"DELETE", dataType).then((response) => {

        })

        const itemDelete = type.filter(item => item.id !== id);
        setType(itemDelete)
        clear();
    }

    const clear = () => {
      setdataType({ id:"",typeName:""});
    }
    console.log(dataType);
    return (
        <form className="mt-4" style={{ marginLeft: 150 }}>
           <div className="row mt-2">
              <label htmlFor="inputEmail3" className="col-md-2 col-form-label">ID</label>
              <div className="col-md-8">
                 <input disabled name="id"  type="input" className="form-control"  onChange={onChangHandler} value={dataType.id || ''}  />
              </div>
           </div>
           <div className=" row mt-2">
              <label htmlFor="inputEmail3" className="col-md-2 col-form-label">Loại laptop</label>
              <div className="col-md-8">
                 <input name="typeName" type="input" onChange={onChangHandler}   className="form-control" value={dataType.typeName || ''} />
              </div>
           </div>
  
           <div className="form-group row">
              <div className="col-md-10 ml-auto">
              <button type="submit" className="btn btn-success " onClick={(event) =>addType(event)} >Thêm</button>
              <button type="submit" className="btn btn-warning " onClick={(event) =>updateType(event,dataType.id)}>Sửa</button>
              <button type="submit" className="btn btn-danger " onClick={(event) =>deleteType(event,dataType.id)}>Xóa</button>
                 <button type="button" className="btn btn-primary ml-3" onClick={clear}>Clear</button>
              </div>
           </div>
        </form>
     );
}

export default CreateTypeComponent;
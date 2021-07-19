import React, { Component, useState } from 'react';
import ApiCaller from '../AxiosUtils/ApiCaller';

function CreateRamTypeComponent({dataRam,setdataRam,ramtype,setRamType}) {

    const onChangHandler = (event) => {
        const name = event.target.name;
        const value = event.target.value
        setdataRam({
            ...dataRam,
            [name]: value,
        })
    }

    const addRamType = (event) =>{
        event.preventDefault();
        ApiCaller("ramtype","POST",dataRam).then((response) => {

        })

        const itemInsert = setRamType([
            ...ramtype,
            dataRam
        ]);
        clear();
    }

    const updateRamType=(event,id)=>{
        event.preventDefault();
        console.log(ramtype);
        debugger
        ApiCaller("ramtype/" + id,"PUT", dataRam).then((response) => {

        })
        setRamType(ramtype)
        clear();
    }

    const deleteRamType = (event,id)=>{
        event.preventDefault();
        ApiCaller("ramtype/" + id,"DELETE", dataRam).then((response) => {

        })
        const itemDelete = ramtype.filter(item => item.id !== id);
        setRamType(itemDelete)
        clear();
    }
   
    const clear = () => {
      setdataRam({ id:"",gb:"",ramType:"",speed:""});
    }
  
    return (
        <form className="mt-4" style={{ marginLeft: 150 }}>
           <div className="row mt-2">
              <label htmlFor="inputEmail3" className="col-md-2 col-form-label">ID</label>
              <div className="col-md-8">
                 <input disabled name="id"  type="input" className="form-control"  onChange={onChangHandler} value={dataRam.id || ''}  />
              </div>
           </div>
           <div className=" row mt-2">
              <label htmlFor="inputEmail3" className="col-md-2 col-form-label">GB</label>
              <div className="col-md-8">
                 <input name="gb" type="input" onChange={onChangHandler}   className="form-control" value={dataRam.gb || ''} />
              </div>
           </div>
           <div className=" row mt-2">
              <label htmlFor="inputEmail3" className="col-md-2 col-form-label">Loại RAM</label>
              <div className="col-md-8">
                 <input name="ramType" type="input"  onChange={onChangHandler}   className="form-control"  value={dataRam.ramType || ''} />
              </div>
           </div>
           <div className=" row mt-2">
              <label htmlFor="inputEmail3" className="col-md-2 col-form-label">Tốc độ</label>
              <div className="col-md-8">
                 <input name="speed" type="input"  onChange={onChangHandler}  className="form-control" value={dataRam.speed || ''}  />
              </div>
           </div>
  
           <div className="form-group row">
              <div className="col-md-10 ml-auto">
              <button type="submit" className="btn btn-success " onClick={(event) =>addRamType(event)} >Thêm</button>
              <button type="submit" className="btn btn-warning " onClick={(event) =>updateRamType(event,dataRam.id)}>Sửa</button>
              <button type="submit" className="btn btn-danger " onClick={(event) =>deleteRamType(event,dataRam.id)}>Xóa</button>
                 <button type="button" className="btn btn-primary ml-3" onClick={clear}>Clear</button>
              </div>
           </div>
        </form>
     );
}

export default CreateRamTypeComponent;
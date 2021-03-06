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
        console.log(ramtype);
        clear();
    }

    const updateRamType=(event,id)=>{
        event.preventDefault();
        ApiCaller("ramtype/" + id,"PUT", dataRam).then((response) => {
            console.log(response.data);
        })
        clear();
    }

    const deleteRamType = (event,id)=>{
        event.preventDefault();
        console.log(ramtype);
        ApiCaller("ramtype/" + id,"DELETE", dataRam).then((response) => {

        })

        const itemDelete = ramtype.filter(item => item.id !== id);
        setRamType(itemDelete)
        clear();
    }

    const clear = () => {
      setdataRam({ id:"",gb:"",ramType:"",speed:""});
    }
    console.log(dataRam);
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
              <label htmlFor="inputEmail3" className="col-md-2 col-form-label">Lo???i RAM</label>
              <div className="col-md-8">
                 <input name="ramType" type="input"  onChange={onChangHandler}   className="form-control"  value={dataRam.ramType || ''} />
              </div>
           </div>
           <div className=" row mt-2">
              <label htmlFor="inputEmail3" className="col-md-2 col-form-label">T???c ?????</label>
              <div className="col-md-8">
                 <input name="speed" type="input"  onChange={onChangHandler}  className="form-control" value={dataRam.speed || ''}  />
              </div>
           </div>
  
           <div className="form-group row">
              <div className="col-md-10 ml-auto">
              <button type="submit" className="btn btn-success " onClick={(event) =>addRamType(event)} >Th??m</button>
              <button type="submit" className="btn btn-warning " onClick={(event) =>updateRamType(event,dataRam.id)}>S???a</button>
              <button type="submit" className="btn btn-danger " onClick={(event) =>deleteRamType(event,dataRam.id)}>X??a</button>
                 <button type="button" className="btn btn-primary ml-3" onClick={clear}>Clear</button>
              </div>
           </div>
        </form>
     );
}

export default CreateRamTypeComponent;
import React, { Component, useState } from 'react';
import ApiCaller from '../AxiosUtils/ApiCaller';

function CreateScreenTypeComponent({dataScreen,setdataScreen,screentype,setScreenType}) {

    const onChangHandler = (event) => {
        const name = event.target.name;
        const value = event.target.value
        setdataScreen({
            ...dataScreen,
            [name]: value,
        })
    }

    const addScreenType = (event) =>{
        event.preventDefault();
        ApiCaller("screentype","POST",dataScreen).then((response) => {

        })

        const itemInsert = setScreenType([
            ...screentype,
            dataScreen
        ]);
        clear();
    }
    const updateScreenType=(event,id)=>{
        event.preventDefault();
        ApiCaller("screentype/" + id,"PUT", dataScreen).then((response) => {
        })
        setScreenType(screentype)
        clear();
    }

    const deleteScreenType = (event,id)=>{
        event.preventDefault();
        ApiCaller("screentype/" + id,"DELETE", dataScreen).then((response) => {

        })

        const itemDelete = screentype.filter(item => item.id !== id);
        setScreenType(itemDelete)
        clear();
    }

    const clear = () => {
      setdataScreen({ id:"",size:"",resolution:"",technology:"",induction:"" });
    }
    return (
        <form className="mt-4" style={{ marginLeft: 150 }}>
           <div className="row mt-2">
              <label htmlFor="inputEmail3" className="col-md-2 col-form-label">ID</label>
              <div className="col-md-8">
                 <input disabled name="id"  type="input" className="form-control"  onChange={onChangHandler} value={dataScreen.id || ''}  />
              </div>
           </div>
           <div className=" row mt-2">
              <label htmlFor="inputEmail3" className="col-md-2 col-form-label">Kích thước</label>
              <div className="col-md-8">
                 <input name="size" type="input" onChange={onChangHandler}   className="form-control" value={dataScreen.size || ''} />
              </div>
           </div>
           <div className=" row mt-2">
              <label htmlFor="inputEmail3" className="col-md-2 col-form-label">Độ phân giải</label>
              <div className="col-md-8">
                 <input name="resolution" type="input"  onChange={onChangHandler}   className="form-control"  value={dataScreen.resolution || ''} />
              </div>
           </div>
           <div className=" row mt-2">
              <label htmlFor="inputEmail3" className="col-md-2 col-form-label">Công nghệ màn hình</label>
              <div className="col-md-8">
                 <input name="technology" type="input"  onChange={onChangHandler}  className="form-control" value={dataScreen.technology || ''}  />
              </div>
           </div>
           <div className=" row mt-2">
              <label htmlFor="inputEmail3" className="col-md-2 col-form-label">Cảm ứng</label>
              <div className="col-md-8">
                 <input name="induction" type="input"  onChange={onChangHandler}   className="form-control" value={dataScreen.induction || ''} />
              </div>
           </div>
  
           <div className="form-group row">
              <div className="col-md-10 ml-auto">
              <button type="submit" className="btn btn-success " onClick={(event) =>addScreenType(event)} >Thêm</button>
              <button type="submit" className="btn btn-warning " onClick={(event) =>updateScreenType(event,dataScreen.id)}>Sửa</button>
              <button type="submit" className="btn btn-danger " onClick={(event) =>deleteScreenType(event,dataScreen.id)}>Xóa</button>
                 <button type="button" className="btn btn-primary ml-3" onClick={clear}>Clear</button>
              </div>
           </div>
        </form>
     );
}

export default CreateScreenTypeComponent;
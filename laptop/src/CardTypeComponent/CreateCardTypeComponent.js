import React, { Component, useState } from 'react';
import ApiCaller from '../AxiosUtils/ApiCaller';

function CreateCardTypeComponent({dataCard,setdataCard,cardtype,setCardType}) {

    const onChangHandler = (event) => {
        const name = event.target.name;
        const value = event.target.value
        setdataCard({
            ...dataCard,
            [name]: value,
        })
    }

    const addCardType = (event) =>{
        event.preventDefault();
        ApiCaller("cardtype","POST",dataCard).then((response) => {

        })

        const itemInsert = setCardType([
            ...cardtype,
            dataCard
        ]);
        clear();
    }

    const updateCardType=(event,id)=>{
        event.preventDefault();
        ApiCaller("cardtype/" + id,"PUT", dataCard).then((response) => {
        })
        setCardType(cardtype)
        clear();
    }

    const deleteCardType = (event,id)=>{
        event.preventDefault();
        ApiCaller("cardtype/" + id,"DELETE", dataCard).then((response) => {

        })

        const itemDelete = cardtype.filter(item => item.id !== id);
        setCardType(itemDelete)
        clear();
    }

    const clear = () => {
      setdataCard({ id:"",cardDesign:"",cardType:"" });
    }
    return (
        <form className="mt-4" style={{ marginLeft: 150 }}>
           <div className="row mt-2">
              <label htmlFor="inputEmail3" className="col-md-2 col-form-label">ID</label>
              <div className="col-md-8">
                 <input disabled name="id"  type="input" className="form-control"  onChange={onChangHandler} value={dataCard.id || ''}  />
              </div>
           </div>
           <div className=" row mt-2">
              <label htmlFor="inputEmail3" className="col-md-2 col-form-label">Kích thước</label>
              <div className="col-md-8">
                 <input name="cardDesign" type="input" onChange={onChangHandler}   className="form-control" value={dataCard.cardDesign || ''} />
              </div>
           </div>
           <div className=" row mt-2">
              <label htmlFor="inputEmail3" className="col-md-2 col-form-label">Độ phân giải</label>
              <div className="col-md-8">
                 <input name="cardType" type="input"  onChange={onChangHandler}   className="form-control"  value={dataCard.cardType || ''} />
              </div>
           </div>
  
           <div className="form-group row">
              <div className="col-md-10 ml-auto">
              <button type="submit" className="btn btn-success " onClick={(event) =>addCardType(event)} >Thêm</button>
              <button type="submit" className="btn btn-warning " onClick={(event) =>updateCardType(event,dataCard.id)}>Sửa</button>
              <button type="submit" className="btn btn-danger " onClick={(event) =>deleteCardType(event,dataCard.id)}>Xóa</button>
                 <button type="button" className="btn btn-primary ml-3" onClick={clear}>Clear</button>
              </div>
           </div>
        </form>
     );
}

export default CreateCardTypeComponent;
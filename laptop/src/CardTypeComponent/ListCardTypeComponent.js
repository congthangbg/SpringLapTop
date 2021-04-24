import React, { Component } from 'react';
import { useEffect, useState } from 'react';
import { TableHead, TableRow, TableCell, TableBody, Button } from '@material-ui/core';
import ApiCaller from '.././AxiosUtils/ApiCaller';
import CreateCardTypeComponent from './CreateCardTypeComponent';


function ListCardTypeComponent({dataCard,setdataCard,cardtype,setCardType}){

    const [item, setItem] = useState("")

    // API
    useEffect(() => {
        ApiCaller("cardtype", "GET",null).then(response => {
            const  data  = response.data
            setCardType(data)
        })
    },[dataCard])

    const editCardType = (value) => {
      setdataCard(value)
    }
    console.log(cardtype)
    return (
        <div className="container">
  
           <section className="section">
              <h1 className="section-heading">Loại Card</h1>
              <CreateCardTypeComponent
              item={item} dataCard={dataCard} setdataCard={setdataCard}
              cardtype={cardtype} setCardType={setCardType} />
              <div className="row">
                 <table className="table table-hover ">
                    <TableHead>
                       <TableRow >
                          <TableCell>ID</TableCell>
                          <TableCell>Thiet ke</TableCell>
                          <TableCell>Loai card</TableCell>
                          <TableCell></TableCell>
                       </TableRow>
                    </TableHead>
                    <TableBody>
                       {
                           cardtype.map((value, index) => {
                             return (
                                <TableRow key={index} >
                                   <TableCell>{value.id}</TableCell>
                                   <TableCell>{value.cardDesign}</TableCell>
                                   <TableCell>{value.cardType}</TableCell>
                                   <TableCell><button onClick={() =>editCardType(value)}
                                      className="btn btn-warning">Edit</button></TableCell>
                                </TableRow>
                             )
                          })
                       }
  
                    </TableBody>
                    
                 </table>
               
              </div>
           </section>
  
        </div>
     );

}
export default ListCardTypeComponent;
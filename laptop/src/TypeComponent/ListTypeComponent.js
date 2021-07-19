import React, { Component } from 'react';
import { useEffect, useState } from 'react';
import { TableHead, TableRow, TableCell, TableBody, Button } from '@material-ui/core';
import ApiCaller from '.././AxiosUtils/ApiCaller';
import CreateTypeComponent from './CreateTypeComponent';


function ListTypeComponent({dataType,setdataType,type,setType}){

    const [item, setItem] = useState("")

    // API
    useEffect(() => {
        ApiCaller("type", "GET",null).then(response => {
            const  data  = response.data
            setType(data)
        })
    },[dataType,type])

    const editType = (value) => {
      setdataType(value)
    }
    return (
        <div className="container">
           <section className="section">
              <h1 className="section-heading">Phân loại Laptop</h1>
              <CreateTypeComponent
              item={item} dataType={dataType} setdataType={setdataType}
              type={type} setType={setType} />
              <div className="row">
                 <table className="table table-hover ">
                    <TableHead>
                       <TableRow >
                          <TableCell>ID</TableCell>
                          <TableCell>Tên loại</TableCell>
                          <TableCell></TableCell>
                       </TableRow>
                    </TableHead>
                    <TableBody>
                       {
                           type? type.map((value, index) => {
                             return (
                                <TableRow key={index} >
                                   <TableCell>{value.id}</TableCell>
                                   <TableCell>{value.typeName}</TableCell>
                                   <TableCell><button onClick={() =>editType(value)}
                                      className="btn btn-warning">Edit</button></TableCell>
                                </TableRow> 
                             )
                          }) : ""
                       }
  
                    </TableBody>
                    
                 </table>
               
              </div>
           </section>
  
        </div>
     );

}
export default ListTypeComponent;
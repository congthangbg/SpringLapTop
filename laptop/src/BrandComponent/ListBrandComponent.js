import React, { Component } from 'react';
import { useEffect, useState } from 'react';
import { TableHead, TableRow, TableCell, TableBody, Button } from '@material-ui/core';
import ApiCaller from '.././AxiosUtils/ApiCaller';
import CreateBrandComponent from './CreateBrandComponent';


function ListBrandComponent({dataBrand,setdataBrand,brand,setBrand}){

    const [item, setItem] = useState("")

    // API
    useEffect(() => {
        ApiCaller("brand", "GET",null).then(response => {
            const  data  = response.data
            setBrand(data)
        })
    },[dataBrand])

    const editBrand = (value) => {
      setdataBrand(value)
    }
    console.log(brand)
    return (
        <div className="container">
  
           <section className="section">
              <h1 className="section-heading">Hãng Laptop</h1>
              <CreateBrandComponent
              item={item} dataBrand={dataBrand} setdataBrand={setdataBrand}
              brand={brand} setBrand={setBrand} />
              <div className="row">
                 <table className="table table-hover ">
                    <TableHead>
                       <TableRow >
                          <TableCell>ID</TableCell>
                          <TableCell>Tên hãng</TableCell>
                          <TableCell></TableCell>
                       </TableRow>
                    </TableHead>
                    <TableBody>
                       {
                          brand? brand.map((value, index) => {
                             return (
                                <TableRow key={index} >
                                   <TableCell>{value.id}</TableCell>
                                   <TableCell>{value.brandName}</TableCell>
                                   <TableCell><button onClick={() =>editBrand(value)}
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
export default ListBrandComponent;
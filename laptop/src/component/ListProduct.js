import React, { Component } from 'react';
import { useEffect, useState } from 'react'
import { TableHead, TableRow, TableCell, TableBody, Button } from '@material-ui/core';
import ApiCaller from '.././AxiosUtils/ApiCaller';
import CreateProduct from './CreateProduct';
function ListProduct({data,setData,laptop,setLaptop}) {
  
   const [item, setItem] = useState("")

   // API
   useEffect(() => {
      ApiCaller("laptop", "GET", null).then(response => {
         const { data } = response
         setLaptop(data)
      })
   }, [data])

   const editLaptop = (value) => {
      setData(value)
   }
   console.log(item);
   return (
      <div className="container">

         <section className="section">
            <h1 className="section-heading">Danh sách Laptop</h1>
            <CreateProduct 
            item={item} data={data} setData={setData}
            laptop={laptop} setLaptop={setLaptop} />
            <div className="row">
               <table className="table table-hover ">
                  <TableHead>
                     <TableRow >
                        <TableCell>ID</TableCell>
                        <TableCell>Tên Laptop</TableCell>
                        <TableCell>Số lượng</TableCell>
                        <TableCell>Giá</TableCell>
                        <TableCell></TableCell>
                     </TableRow>
                  </TableHead>
                  <TableBody>
                     {
                         laptop.map((value, index) => {
                           return (
                              <TableRow key={index} >
                                 <TableCell>{value.id}</TableCell>
                                 <TableCell>{value.lapTopName}</TableCell>
                                 <TableCell>{value.amount}</TableCell>
                                 <TableCell>{value.price }</TableCell>
                                 <TableCell><button onClick={() =>editLaptop(value)}
                                    className="btn btn-warning">Edit</button></TableCell>
                              </TableRow>
                           )
                        })
                     }

                  </TableBody>
                  
               </table>
               <div className="row">
                     <ul className="pagination mt-4 col-lg-10" style={{ display: 'flex', alignItems: 'center', justifyContent: 'center', }} >
                        <li className="page-item"><a className="page-link bg-info" style={{ fontSize: 20 }} >Trang trước</a> </li>
                        <li className="page-item"><a className="page-link" style={{ fontSize: 20 }}> 1</a> </li>
                        <li className="page-item"><a className="page-link bg-info" style={{ fontSize: 20 }} >Trang sau</a> </li>
                     </ul>
                  </div>
            </div>
         </section>

      </div>
   );
}

export default ListProduct;
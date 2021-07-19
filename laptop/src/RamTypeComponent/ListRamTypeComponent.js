import React, { Component } from 'react';
import { useEffect, useState } from 'react';
import { TableHead, TableRow, TableCell, TableBody, Button } from '@material-ui/core';
import ApiCaller from '.././AxiosUtils/ApiCaller';
import CreateRamTypeComponent from './CreateRamTypeComponent';


function ListRamTypeComponent({dataRam,setdataRam,ramtype,setRamType}){

    const [item, setItem] = useState("")

    // API
    useEffect(() => {
        ApiCaller("ramtype", "GET",null).then(response => {
            const  data  = response.data
            setRamType(data)
        })
        console.log(dataRam);
    },[dataRam,ramtype])

    const editRamType = (value) => {
      setdataRam(value)
    }
    return (
        <div className="container">
  
           <section className="section">
              <h1 className="section-heading">Loại RAM</h1>
              <CreateRamTypeComponent
              item={item} dataRam={dataRam} setdataRam={setdataRam}
              ramtype={ramtype} setRamType={setRamType} />
              <div className="row">
                 <table className="table table-hover ">
                    <TableHead>
                       <TableRow >
                          <TableCell>ID</TableCell>
                          <TableCell>GB</TableCell>
                          <TableCell>Loại RAM</TableCell>
                          <TableCell>Tốc độ</TableCell>
                          <TableCell></TableCell>
                       </TableRow>
                    </TableHead>
                    <TableBody>
                       {
                           ramtype.map((value, index) => {
                             return (
                                <TableRow key={index} >
                                   <TableCell>{value.id}</TableCell>
                                   <TableCell>{value.gb}</TableCell>
                                   <TableCell>{value.ramType}</TableCell>
                                   <TableCell>{value.speed }</TableCell>
                                   <TableCell><button onClick={() =>editRamType(value)}
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
export default ListRamTypeComponent;
import React, { Component } from 'react';
import { useEffect, useState } from 'react';
import { TableHead, TableRow, TableCell, TableBody, Button } from '@material-ui/core';
import ApiCaller from '.././AxiosUtils/ApiCaller';
import CreateScreenTypeComponent from './CreateScreenTypeComponent';


function ListScreenTypeComponent({dataScreen,setdataScreen,screentype,setScreenType}){

    const [item, setItem] = useState("")

    // API
    useEffect(() => {
        ApiCaller("screentype", "GET",null).then(response => {
            const  data  = response.data
            setScreenType(data)
        })
    },[dataScreen])

    const editScreenType = (value) => {
      setdataScreen(value)
    }
    console.log(screentype)
    return (
        <div className="container">
  
           <section className="section">
              <h1 className="section-heading">Loại Màn Hình</h1>
              <CreateScreenTypeComponent
              item={item} dataScreen={dataScreen} setdataScreen={setdataScreen}
              screentype={screentype} setScreenType={setScreenType} />
              <div className="row">
                 <table className="table table-hover ">
                    <TableHead>
                       <TableRow >
                          <TableCell>ID</TableCell>
                          <TableCell>Kích thước</TableCell>
                          <TableCell>Độ phân giải</TableCell>
                          <TableCell>Công nghệ màn hình</TableCell>
                          <TableCell>Cảm ứng</TableCell>
                          <TableCell></TableCell>
                       </TableRow>
                    </TableHead>
                    <TableBody>
                       {
                           screentype.map((value, index) => {
                             return (
                                <TableRow key={index} >
                                   <TableCell>{value.id}</TableCell>
                                   <TableCell>{value.size}</TableCell>
                                   <TableCell>{value.resolution}</TableCell>
                                   <TableCell>{value.technology }</TableCell>
                                   <TableCell>{value.induction }</TableCell>
                                   <TableCell><button onClick={() =>editScreenType(value)}
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
export default ListScreenTypeComponent;
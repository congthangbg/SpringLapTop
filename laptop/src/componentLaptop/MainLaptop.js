import React, { useState } from 'react';
import { useEffect } from 'react'

import ApiCaller from '../AxiosUtils/ApiCaller';
import CreateProduct from './MainCreateLaptop';
import TableLaptop from './MainTableLaptop';
function ListProduct({ data, setData,
    laptop, setLaptop, item, setItem
     ,laptopDetail,setLaptopDetail,dataLaptop, setDataLaptop,
     dataLaptopDetail, setDataLaptopDetail, 
     brand, setBrand, type, setType
   }) {

   // API
   useEffect(() => {
      ApiCaller("laptop", "GET", null).then(response => {
         const { data } = response
         setLaptop(data)
      })
   }, [])

   useEffect(() => {
      ApiCaller("brand", "GET", null).then(response => {
         const { data } = response
         setBrand(data)
      })
   }, [])
   useEffect(() => {
      ApiCaller("type", "GET", null).then(response => {
         const { data } = response
         setType(data)
      })
   }, [])
   const editLaptop = (value) => {
      setData(value)
   }


   


   return (
      <div className="container">
         <h1 className="section-heading mt-3 mb-3">Laptop</h1>

         <section id="tabs" className="project-tab">

            <div className="container">
               <div className="row">
                  <div className="col-md-12">
                     <nav>
                        <div className="nav nav-tabs nav-fill" id="nav-tab" role="tablist">
                           <a className="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab" aria-controls="nav-home" aria-selected="true">Chi tiết laptop</a>
                           <a className="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile" role="tab" aria-controls="nav-profile" aria-selected="false">Danh sách laptop</a>
                        </div>
                     </nav>
                     <div className="tab-content" id="nav-tabContent">
                        <div className="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">

                           <CreateProduct
                           brand={brand} type={type}
                            dataLaptopDetail={dataLaptopDetail} setDataLaptopDetail={setDataLaptopDetail}
                              dataLaptop={dataLaptop} setDataLaptop={setDataLaptop}
                              item={item} setItem={setItem} data={data}
                              setData={setData}
                              laptop={laptop} setLaptop={setLaptop}
                              laptopDetail={laptopDetail} setLaptopDetail={setLaptopDetail}
                             
                           />

                        </div>
                        <div className="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">
                              <TableLaptop/>
                        </div>

                     </div>
                  </div>
               </div>
            </div>
         </section>
      </div>
   );
}

export default ListProduct;
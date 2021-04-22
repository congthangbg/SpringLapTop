import React from 'react';

function TableLaptop() {
   return (
      <div>

         <div className="form-row">
            <div className="col-6 row mt-3 ml-auto">
               <label htmlFor="inputEmail3" className="col-md-3 col-form-label">Phân loại</label>
               <div className="col-md-9" >
                  <select className=" browser-default custom-select " style={{width:300}} name="description"  >
                     <option>Laptop Gaming</option>
                     <option>Laptop văn phòng</option>
                  </select>
               </div>
            </div>
            <div className="col-6 row mt-3">
               <label htmlFor="inputEmail3" className="col-md-3 col-form-label">Hãng</label>
               <div className="col-md-9" >
                  <select className=" browser-default custom-select " style={{width:300}} name="description">
                     <option>Asus</option>
                     <option>Mac</option>
                     <option>Dell</option>
                  </select>
               </div>
            </div>
         </div>
         <table className="table mt-4" cellSpacing={0} >
            <thead>
               <tr>
                  <th>ID Laptop</th>
                  <th>Tên Laptop</th>
                  <th>CPU</th>
                  <th>RAM</th>
                  <th>Card đồ họa</th>
                  <th>Màn hình</th>
                  <th>Ổ cứng</th>
               </tr>
            </thead>
            <tbody>

               <tr>
                  <td>Work 3</td>
                  <td>Dooley</td>
                  <td>july@example.com</td>
                  <td>Work 3</td>
                  <td>Dooley</td>
                  <td>july@example.com</td>
                  <td>july@example.com</td>
               </tr>
            </tbody>
         </table>
      </div>
   );
}


export default TableLaptop;
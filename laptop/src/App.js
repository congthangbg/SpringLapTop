
import React, { useEffect, useState } from 'react'
import Footer from './componentLaptop/Footer';
import Header from './componentLaptop/Header';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import MainLaptop from './componentLaptop/MainLaptop'
import Slideshow from './componentLaptop/Slideshow';
import './App.css';

import ListScreenTypeComponent from './ScreenTypeComponent/ListScreenTypeComponent';
import ListRamTypeComponent from './RamTypeComponent/ListRamTypeComponent';
function App() {
      const [item, setItem] = useState(false)
      const [brand, setBrand] = useState("")
      const [type, setType] = useState("")
      const [dataLaptop, setDataLaptop] = useState([{ brand:{},image:"",lapTopName: '', price: "" ,type:{}}])
      const [laptop, setLaptop] = useState([{ brand:{},image:"",lapTopName: '', price: "" ,type:{}}])
      const [screentype, setScreentype] = useState([])
      const [dataScreen, setdataScreen] = useState([{ size: '', resolution: "", technology: '', induction: '' }])
      // const [ramtype, setRamType] = useState([])
      // const [dataRam, setdataRam] = useState([{ gb: '', ramType: "", speed: '' }])
      const [laptopDetail,setLaptopDetail] = useState([{cpu :"",rom:"",keyBoard:"",system:"",color:"",connector:"",camera:"",
                                                         audio:"",pin:"",size:"",weight:"",component:"",year:""}])
        const [dataLaptopDetail, setDataLaptopDetail] = useState("")
      return (
         <div >
            <Router>
               <div className="container-fluid">
                  <main id="mainContainer" >
                     <Header />
                     <Slideshow />
                     <Switch>
                        <Route path="/" exact>
                           <MainLaptop dataLaptop={dataLaptop} setDataLaptop={setDataLaptop}
                              laptop={laptop} setLaptop={setLaptop}
                              item={item} setItem={setItem}
                              laptopDetail={laptopDetail} setLaptopDetail={setLaptopDetail}
                              dataLaptopDetail={dataLaptopDetail} setDataLaptopDetail={setDataLaptopDetail}
                              brand={brand} setBrand={setBrand}
                              type={type} setType={setType}
                           />
                        </Route>
                        <Route path="/laptop">
                           <MainLaptop
                              dataLaptop={dataLaptop} setDataLaptop={setDataLaptop}
                              laptop={laptop} setLaptop={setLaptop}
                              item={item} setItem={setItem}
                              laptopDetail={laptopDetail} setLaptopDetail={setLaptopDetail}
                              dataLaptopDetail={dataLaptopDetail} setDataLaptopDetail={setDataLaptopDetail}
                              brand={brand} setBrand={setBrand}
                              type={type} setType={setType}
                           />
                        </Route>
                        <Route path="/screentype">
                           <ListScreenTypeComponent screentype={screentype} setScreenType={setScreentype} dataScreen={dataScreen} setdataScreen={setdataScreen} />
                        </Route>
                        {/* <Route path="/ramtype">
                           <ListRamTypeComponent ramtype={ramtype} setRamType={setRamType} dataRam={dataRam} setdataRam={setdataRam} />
                        </Route> */}
                     </Switch>
                  </main>
                  <Footer />
               </div>
            </Router>
         </div>
      );
   }
   export default App;

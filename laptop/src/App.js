
import React, { useEffect, useState } from 'react'
import Footer from './componentLaptop/Footer';
import Header from './componentLaptop/Header';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import MainLaptop from './componentLaptop/MainLaptop'
import Slideshow from './componentLaptop/Slideshow';
import './App.css';
import ListTypeComponent from './TypeComponent/ListTypeComponent';
import ListBrandComponent from './BrandComponent/ListBrandComponent';
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

        const [ramtype, setRamType] = useState([])
        const [dataRam, setdataRam] = useState([{gb: '',ramType:"",speed: ''}])
        const [dataType, setdataType] = useState([{typeName: ''}])
        const [dataBrand, setdataBrand] = useState([{brandName: ''}])
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
                        <Route path="/ramtype">
                       <ListRamTypeComponent ramtype={ramtype} setRamType={setRamType} dataRam={dataRam} setdataRam={setdataRam}  />
                     </Route>
                     <Route path="/type">
                       <ListTypeComponent type={type} setType={setType} dataType={dataType} setdataType={setdataType}  />
                     </Route>
                     <Route path="/brand">
                       <ListBrandComponent brand={brand} setBrand={setBrand} dataBrand={dataBrand} setdataBrand={setdataBrand}  />
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

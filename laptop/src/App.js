
import React, { useEffect, useState } from 'react'
import Footer from './componentLaptop/Footer';
import Header from './componentLaptop/Header';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
<<<<<<< HEAD
import ListProduct from './componentLaptop/MainLaptop';
import Slideshow from './componentLaptop/Slideshow';
import './App.css';
function App() {
   const [data, setData] = useState([{lapTopName: '',price:"",amount: ''}])
   const [laptop, setLaptop] = useState([])
   const [item, setItem] = useState(false)
=======
import ListProduct from './component/ListProduct';
import Slideshow from './component/Slideshow';
import ListScreenTypeComponent from './ScreenTypeComponent/ListScreenTypeComponent';
import ListRamTypeComponent from './RamTypeComponent/ListRamTypeComponent';
function App() {
   const [data, setData] = useState([{lapTopName: '',price:"",amount: ''}])
   const [laptop, setLaptop] = useState([])
   const [screentype, setScreentype] = useState([])
   const [dataScreen, setdataScreen] = useState([{size: '',resolution:"",technology: '',induction: ''}])
<<<<<<< HEAD
   const [ramtype, setRamType] = useState([])
   const [dataRam, setdataRam] = useState([{gb: '',ramType:"",speed: ''}])
=======
>>>>>>> 3979852080ced99ef52dd8e9fa409e6527dc31c4
>>>>>>> master

   return (
      <div >
         <Router>
            <div className="container-fluid">
               <main id="mainContainer" >
                  <Header />
                  <Slideshow />
                  <Switch>
                     <Route path="/" exact>
                        <ListProduct data={data} setData={setData}
                        laptop={laptop} setLaptop={setLaptop}
                        item={item} setItem={setItem}
                        />
                     </Route>
                     <Route path="/laptop">
                        <ListProduct 
                        data={data} setData={setData}
                        laptop={laptop} setLaptop={setLaptop}
                        item={item} setItem={setItem}
                        />
                     </Route>
                     <Route path="/screentype">
                       <ListScreenTypeComponent screentype={screentype} setScreenType={setScreentype} dataScreen={dataScreen} setdataScreen={setdataScreen}  />
                     </Route>
                     <Route path="/ramtype">
                       <ListRamTypeComponent ramtype={ramtype} setRamType={setRamType} dataRam={dataRam} setdataRam={setdataRam}  />
                     </Route>
                  </Switch>
               </main>
               <Footer />

            </div>
         </Router>
      </div>
   );
}

export default App;

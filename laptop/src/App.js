
import React, { useEffect, useState } from 'react'
import Footer from './component/Footer';
import Header from './component/Header';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import ListProduct from './component/ListProduct';
import Slideshow from './component/Slideshow';
import ListScreenTypeComponent from './ScreenTypeComponent/ListScreenTypeComponent';
import ListRamTypeComponent from './RamTypeComponent/ListRamTypeComponent';
function App() {
   const [data, setData] = useState([{lapTopName: '',price:"",amount: ''}])
   const [laptop, setLaptop] = useState([])
   const [screentype, setScreentype] = useState([])
   const [dataScreen, setdataScreen] = useState([{size: '',resolution:"",technology: '',induction: ''}])
   const [ramtype, setRamType] = useState([])
   const [dataRam, setdataRam] = useState([{gb: '',ramType:"",speed: ''}])

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
                        />
                     </Route>
                     <Route path="/laptop">
                        <ListProduct data={data} setData={setData}/>
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

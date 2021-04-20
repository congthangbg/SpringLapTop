
import React, { useEffect, useState } from 'react'
import Footer from './componentLaptop/Footer';
import Header from './componentLaptop/Header';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import ListProduct from './componentLaptop/MainLaptop';
import Slideshow from './componentLaptop/Slideshow';
import './App.css';
function App() {
   const [data, setData] = useState([{lapTopName: '',price:"",amount: ''}])
   const [laptop, setLaptop] = useState([])
   const [item, setItem] = useState(false)

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
                  </Switch>
               </main>
               <Footer />

            </div>
         </Router>
      </div>
   );
}

export default App;

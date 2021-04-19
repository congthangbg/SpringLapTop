
import React, { useEffect, useState } from 'react'
import Footer from './component/Footer';
import Header from './component/Header';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import ListProduct from './component/ListProduct';
import Slideshow from './component/Slideshow';
function App() {
   const [data, setData] = useState([{lapTopName: '',price:"",amount: ''}])
   const [laptop, setLaptop] = useState([])

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
                  </Switch>
               </main>
               <Footer />

            </div>
         </Router>
      </div>
   );
}

export default App;

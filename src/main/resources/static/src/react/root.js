'use strict';

import React, { Component } from 'react';
import {BrowserRouter, Route} from 'react-router-dom';
import Main from './pages/main/main';
import DetailContent from './pages/detailContent/detailContent'
const Root = () =>(
    <BrowserRouter>
        <div>
            <Route exact path = "/" component={Main}/>
            <Route path = "/busDetail:busTitle" component={DetailContent}/>
        </div>
    </BrowserRouter>
)
export default Root;
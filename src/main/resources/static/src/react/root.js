'use strict';

import React, { Component } from 'react';
import {BrowserRouter, Route} from 'react-router-dom';
import Main from './pages/main';

const Root = () =>(
    <BrowserRouter>
        <div>
            <Route exact path = "/" component={Main}/>
            <Route exact path = "/test" component={Main}/>
        </div>
    </BrowserRouter>
)
export default Root;
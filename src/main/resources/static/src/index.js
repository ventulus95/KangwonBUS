'use strict';

import React from 'react';
import ReactDOM from 'react-dom';
import Root from './react/root';
import './index.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import $ from 'jquery';

let links = [
    {'name' : 'React & Sass Sample', 'link' : '/react'}
];

$(document).ready(() => {
    console.log('trigger document ready!!!');
    ReactDOM.render(<Root/>, document.getElementById('root'));
});


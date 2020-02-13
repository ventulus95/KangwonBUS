'use strict';

import React, { useState, useEffect } from 'react';
import {NavLink} from "react-router-dom";
import './card.css'
import busImg from './bus-stop.svg';
const Card = (props) => {
    useEffect(function() {

    })
    return(
        <div className='cardRoot'>
            <img className='busImg' src ={busImg}/>
            <div className='cardTitle'>
                <NavLink className='detailLink' to  = {{
                    pathname: `/busDetail/${props.title}`,
                }}>
                    <div>{props.title}</div>
                </NavLink>


            </div>
        </div>
    )
}
export default Card
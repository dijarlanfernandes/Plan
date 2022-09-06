import React, {useEffect, useState} from 'react';
import axios from 'axios';
import './App.css';
import api from '../services/api'

export default function App() {  

    const [loja, setLoja] = useState();
    
    useEffect(()=>{

        api.get("/lojas")
        .then((Response)=> setLoja(Response.data))
        .catch((err)=>{
            console.error("erro ocorreu:", err)
        })
    },[]);

    return (
            <div className='App'>
                <p>name:{loja?.nome}</p>                
                <p>name:{loja?.endereco}</p>                
                <p>name:{loja?.bairro}</p>                
            </div>
    )
}


import React from 'react'
import './ServicesCards.css'

export default function AzureServicesCards({img, text, link}) {

  return (
    <>
        <div className='service-cards'>
            <div className='service-cards-container'>
                <div className='service-img'>
                    <img src={img} />
                </div>
                <div className='service-text'>
                    <p>{text}</p>
                </div>
                <div className='service-link'>
                    <a href='#'>{link}</a>
                </div>
            </div>
        </div>
    </>
  )
}


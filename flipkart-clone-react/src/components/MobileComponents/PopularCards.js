import React from 'react'
import './PopularCards.css'

function PopularCards({img, text, link}) {
  return (
    <>
        <div className='popular-picks-cards'>
            <div className='popular-picks-card-img'>
                <img src={img} />
            </div>
            <div className='popular-picks-cards-content'>
                <h3>{text}</h3>
                <p>{link}</p>
            </div>
        </div>
    </>
  )
}

export default PopularCards
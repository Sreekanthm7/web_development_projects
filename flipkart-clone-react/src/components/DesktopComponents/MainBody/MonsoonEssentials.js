import React, { useState, useEffect, useRef } from "react"
import DataMainCardTwo from "./DataMainCardTwo"
import "./MonsoonEssentials.css"
import ProductDesktopCards from "./ProductDesktopCards"
import arrow from "../../../assets/img/btnarrowdesktop.svg"

function MonsoonEssentials() {
  const [mainCard, setMainCard] = useState([])
  const [productCard, setProductCard] = useState([])
  const imageCard = useRef()
  const arrowRight = useRef()
  const arrowLeft = useRef()

  const fetchData = () => {
    fetch(
      "https://raw.githubusercontent.com/Sreekanthm7/jsondata/main/flipkart-json-data/flipkart.json"
    )
      .then((response) => {
        return response.json()
      })
      .then((data) => {
        setMainCard(data.MonsoonEssentialsMainCard)
        setProductCard(data.MonsoonEssentialsDesktopCards)
      })
  }

  useEffect(() => {
    fetchData()
  }, [])

  const handleClickRight = () => {
    imageCard.current.style.transform = `translateX(${-50}%)`
    arrowRight.current.style.display = "none"
    arrowLeft.current.style.display = "flex"
    imageCard.current.style.transition = "transform ease-in-out 0.45s"
  }
  const handleClickLeft = () => {
    imageCard.current.style.transform = `translateX(${2}%)`
    arrowLeft.current.style.display = "none"
    arrowRight.current.style.display = "flex"
    imageCard.current.style.transition = "transform ease-in-out 0.45s"
  }

  return (
    <>
      <div className="monsoon-essentials">
        <div className="moonsoon-essential-main-card">
          <DataMainCardTwo text={mainCard} />
        </div>
        <div
          className="left-btn-monsoon"
          ref={arrowLeft}
          onClick={handleClickLeft}
        >
          <img src={arrow} />
        </div>
        <div className="monsoon-essential-products" ref={imageCard}>
          {productCard.map((item) => {
            return (
              <ProductDesktopCards
                img={item.img}
                heading={item.heading}
                link={item.link}
                text={item.text}
                key={item.img}
              />
            )
          })}
        </div>
        <div
          className="right-btn-monsoon"
          onClick={handleClickRight}
          ref={arrowRight}
        >
          <img src={arrow} />
        </div>
      </div>
    </>
  )
}

export default MonsoonEssentials

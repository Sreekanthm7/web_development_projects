import React, { useState, useEffect, useRef } from "react"
import "./BestOfElectronics.css"
import DataMainCard from "./DataMainCard"
import ProductDesktopCards from "./ProductDesktopCards"
import arrow from "../../../assets/img/btnarrowdesktop.svg"

function BestOfElectronics() {
  const [mainCardData, setMainCardData] = useState({})
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
        setMainCardData(data.BestOfElectronics)
        setProductCard(data.ElectronicsDesktop)
      })
  }

  useEffect(() => {
    fetchData()
  }, [])

  const handleClickRight = () => {
    console.log(imageCard)
    imageCard.current.style.transform = `translateX(${-65}%)`
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
      <div className="best-of-electronics">
        <div className="best-of-electronics-container">
          <DataMainCard
            img={mainCardData.backgroundImg}
            text={mainCardData.text}
          />

        </div>
        <div className="left-btn-electronics" ref={arrowLeft} onClick={handleClickLeft}>
            <img src={arrow} />
          </div>
        <div className="electronics-card-container" ref={imageCard}>
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

        <div className="add-btn">
          <div className="flight-trip-add">
            <img src="https://rukminim1.flixcart.com/fk-p-flap/464/708/image/00b3f96c786dd3d6.jpg?q=70" />
          </div>
          <div
            className="right-btn-electronics"
            onClick={handleClickRight}
            ref={arrowRight}
          >
            <img src={arrow} />
          </div>
        </div>
      </div>
    </>
  )
}

export default BestOfElectronics

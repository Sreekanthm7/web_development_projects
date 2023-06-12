import React from "react"
import Carousel from "./Carousel"
import FashionNav from "./FashionNav"
import GraborGone from "./GraborGone"
import Header from "./Header"
import MobileNav from "./MobileNav"
import OfferNav from "./OfferNav"
import PopularPicks from "./PopularPicks"
import SalesIsLive from "./SalesIsLive"
import SeasonSaleEnd from "./SeasonSaleEnd"

function MobileView() {
  return (
    <>
      <Header />
      <MobileNav />
      <Carousel />
      <FashionNav />
      <OfferNav />
      <PopularPicks />
      <SeasonSaleEnd />
      <GraborGone />
      <SalesIsLive />
    </>
  )
}

export default MobileView

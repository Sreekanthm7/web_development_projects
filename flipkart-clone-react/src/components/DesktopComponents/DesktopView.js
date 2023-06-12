import React from 'react'
import DesktopNav from './Nav/DesktopNav'
import HeaderDesktop from './Header/HeaderDesktop'
import DesktopMainBody from './MainBody/DesktopMainBody'
import FlipkartFooter from './Footer/FlipkartFooter'

function DesktopView() {
  return (
    <>
        <HeaderDesktop />
        <DesktopNav />
        <DesktopMainBody />
        <FlipkartFooter />
    </>
  )
}

export default DesktopView
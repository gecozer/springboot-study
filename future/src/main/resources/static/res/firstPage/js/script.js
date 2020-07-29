var slideshow = document.querySelector(".slideshow");
var slides = document.querySelectorAll(".slideshow .slide");
var bars = document.querySelectorAll(".bars .bar");
var dots = document.querySelectorAll(".nav-dots .dot a");
var slideTitles = document.querySelectorAll(".slide-title");
// https://easings.net
// easing is very important, here I chose easeInOutCubic.
// If you found a better easing function, just overwrite it.
var easing = "cubic-bezier(0.645, 0.045, 0.355, 1)";
var staggeredSlideIn = function (element, delay) {
    return element.animate([
        { transform: "scaleY(0)", transformOrigin: "top" },
        { transform: "scaleY(1)", transformOrigin: "top" }
    ], {
        duration: 800,
        easing: easing,
        fill: "forwards",
        delay: 200 * delay
    });
};
var staggeredSlideOut = function (element, delay) {
    return element.animate([
        { transform: "scaleY(1)", transformOrigin: "top" },
        { transformOrigin: "bottom", offset: 0.001 },
        { transform: "scaleY(0)", transformOrigin: "bottom" }
    ], {
        duration: 800,
        easing: easing,
        fill: "forwards",
        delay: 200 * delay
    });
};
var fadeIn = function (element) {
    return element.animate([
        { opacity: 0, transform: "translateY(100%)" },
        { opacity: 1, transform: "translateY(0)" }
    ], {
        duration: 1200,
        easing: "ease",
        fill: "forwards",
        delay: 500
    });
};
var fadeOut = function (element) {
    return element.animate([
        { opacity: 1, transform: "translateY(0)" },
        { opacity: 0, transform: "translateY(-100%)" }
    ], {
        duration: 600,
        easing: "ease",
        fill: "forwards"
    });
};
var pageTransition = function (activeIndex) {
    slideTitles.forEach(function (slideTitle) { return fadeOut(slideTitle); });
    Promise.all(Array.from(bars).map(function (bar, i) { return staggeredSlideIn(bar, i).finished; })).then(function () {
        setActiveIndex(activeIndex);
        bars.forEach(function (bar, i) {
            staggeredSlideOut(bar, i);
        });
        slideTitles.forEach(function (slideTitle) { return fadeIn(slideTitle); });
    });
};
var setActiveIndex = function (activeIndex) {
    dots.forEach(function (dot) { return dot.classList.remove("active"); });
    dots[activeIndex].classList.add("active");
    slideshow.style.setProperty("--active-index", "" + activeIndex);
    slides.forEach(function (slide) { return (slide.style.zIndex = "-1"); });
    slides[activeIndex].style.zIndex = "0";
};
// dots
//  dots[0].classList.add("active");
dots.forEach(function (dot, activeIndex) {
    dot.addEventListener("click", function () {
        // var currentActiveIndex = slideshow.style.getPropertyValue("--active-index");
        // console.log(currentActiveIndex);
        // console.log(activeIndex);
        // if (Number(currentActiveIndex) !== activeIndex) {
            pageTransition((activeIndex+1)%5);
        // }
    });
});

window.setInterval(()=> {
    if (document.all) {
        dots[0].click();
    } else {
        var e = document.createEvent("MouseEvents");
        e.initEvent("click", true, true);
        dots[0].dispatchEvent(e);
    }
},5000);

window.setInterval(()=>{
    if (document.all) {
        dots[1].click();
    } else {
        var e = document.createEvent("MouseEvents");
        e.initEvent("click", true, true);
        dots[1].dispatchEvent(e);
    }
},10000);
window.setInterval(()=>{
    if (document.all) {
        dots[2].click();
    } else {
        var e = document.createEvent("MouseEvents");
        e.initEvent("click", true, true);
        dots[2].dispatchEvent(e);
    }
},15000);
window.setInterval(()=>{
    if (document.all) {
        dots[3].click();
    } else {
        var e = document.createEvent("MouseEvents");
        e.initEvent("click", true, true);
        dots[3].dispatchEvent(e);
    }
},20000);
window.setInterval(()=>{
    if (document.all) {
        dots[4].click();
    } else {
        var e = document.createEvent("MouseEvents");
        e.initEvent("click", true, true);
        dots[4].dispatchEvent(e);
    }
},25000);
// var sleep = function(time) {
//     var startTime = new Date().getTime() + parseInt(time, 10);
//     while(new Date().getTime() < startTime) {}
// };
// for(var i=0;i<5;i++){
//     pageTransition(i);
// }

// dots[0].classList.add("active");
// sleep(5000);
// for(var i=0;i<5;i++){
//     // if(i==5){i=0;continue;}
//     // console.log(1);
//     // sleep(3000); // 延时函数，单位ms
//     // pageTransition(i);
//     var sx= window.innerWidth/2,sy= window.innerHeight/2,cx= sx,cy=sy;
//     var eventDown = document.createEvent("MouseEvents");
//     eventDown.initMouseEvent("mousedown",true,true,window,0,
//         sx,sy,cx,cy,false,false,false,false,0,null);
//     dots[i].dispatchEvent(eventDown);
//     // dots[i].click();
//     sleep(3000);
// }
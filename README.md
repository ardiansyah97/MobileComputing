## LibGdx Lifecycle
Disini pertama kali kami ingin mengetahui lifecycle pada libGdx, yaitu pada fungsi create(), render(), resize(), dispose(), pause(), dan resume().

## Logging
Untuk mengetahui lifecycle tersebut, kami menggunakan logging pada setiap fungsi. 
> Gdx.apps.log(String tag, String message);

Contoh:

> Gdx.apps.log("Lifecycle", "create()");

![alt text](https://github.com/ardiansyah97/MobileComputing/raw/master/img/lifecycle.PNG "LibGDX Lifecycle")

## Viewport
Pada percobaan ini, saya mencoba 2 Viewport yaitu ScretchViewport dan FitViewport. Perbedaan kedua viewport yaitu ketika dicoba untuk melakukan resize window maka pada ScretchViewport aspek di dalamnya tidak menyesuaikan skala windownya, sedangkan FitViewport akan menyesuaikan skala windownya. Selain itu, pada FitViewport akan menambahkan LetterBoxing untuk ruang yang tersisa.

![alt text](https://github.com/ardiansyah97/MobileComputing/raw/master/img/scretch.png "Scretch Viewport")

![alt text](https://github.com/ardiansyah97/MobileComputing/raw/master/img/fit.png "Fit Viewport")

## Head-Up Display
Untuk membuat HUD, kami menggunakan table yang kami letakkan di bagian atas.

![alt text](https://github.com/ardiansyah97/MobileComputing/raw/master/img/table_top.png "Table")

![alt text](https://github.com/ardiansyah97/MobileComputing/raw/master/img/hud.png "HUD")

## Touch Input
Untuk mendapatkan input user, dalam hal ini menggunakan touch / klik pada mouse. Kami mencobanya menggunakan library Gdx.input. 
>Gdx.input.isTouched(); 

Fungsi di atas akan mengembalikan nilai true atau false. Kemudian bisa juga didapatkan posisi ketika kita men-touch atau mengklik mouse dengan
>Gdx.input.getX();

>Gdx.input.getY();

![alt text](https://github.com/ardiansyah97/MobileComputing/raw/master/img/input.png "Touch Input")

## Moving Sprite
Pada percobaan ini, kami memberikan batasan touch pada sisi kiri dan kanan layar sebesar 25% (25% kiri dan 25% kanan). Jadi ketika kita men-touch pada area tersebut, bola/ball yang merupakan Sprite akan melakukan perpindahan posisi. Untuk melakukan updating posisinya, kami menggunakan
>setPosition(ball.getX() - 10, ball.getY()); //ini akan bergeser ke kiri (ketika layar sebelah kiri di touch)

>setPosition(ball.getX() + 10, ball.getY()); //ini akan bergeser ke kanan (ketika layar sebelah kanan di touch)

![alt text](https://github.com/ardiansyah97/MobileComputing/raw/master/img/before_move.png "Before Clicked/Touched")

![alt text](https://github.com/ardiansyah97/MobileComputing/raw/master/img/move.png "After Clicked/Touched")

## 2D Particles Tool

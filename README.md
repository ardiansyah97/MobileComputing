## LibGdx Lifecycle
Disini pertama kali kami ingin mengetahui lifecycle pada libGdx, yaitu pada fungsi create(), render(), resize(), dispose(), pause(), dan resume().

## Logging
Untuk mengetahui lifecycle tersebut, kami menggunakan logging pada setiap fungsi. 
> Gdx.apps.log(String tag, String message);

Contoh:

> Gdx.apps.log("Lifecycle", "create()");

## Viewport
## Head-Up Display
## Touch Input
Untuk mendapatkan input user, dalam hal ini menggunakan touch / klik pada mouse. Kami mencobanya menggunakan library Gdx.input. 
>Gdx.input.isTouched(); 

Fungsi di atas akan mengembalikan nilai true atau false. Kemudian bisa juga didapatkan posisi ketika kita men-touch atau mengklik mouse dengan
>Gdx.input.getX();

>Gdx.input.getY();

## Moving Sprite
Pada percobaan ini, kami memberikan batasan touch pada sisi kiri dan kanan layar sebesar 25% (25% kiri dan 25% kanan). Jadi ketika kita men-touch pada area tersebut, bola/ball yang merupakan Sprite akan melakukan perpindahan posisi. Untuk melakukan updating posisinya, kami menggunakan
>setPosition(ball.getX() - 10, ball.getY()); //ini akan bergeser ke kiri (ketika layar sebelah kiri di touch)

>setPosition(ball.getX() + 10, ball.getY()); //ini akan bergeser ke kanan (ketika layar sebelah kanan di touch)
## 2D Particles Tool

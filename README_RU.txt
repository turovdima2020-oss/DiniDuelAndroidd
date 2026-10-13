DINO DUEL — проект Android для сборки APK

Внутри:
- app/src/main/assets/index.html — игра (HTML5 Canvas, работает офлайн)
- Android WebView-оболочка для запуска на Android
- Gradle-конфигурация проекта

Как получить APK:
1. Установи Android Studio на компьютер.
2. Открой в Android Studio папку DinoDuelAndroid (распакуй ZIP заранее).
3. Дождись синхронизации Gradle. При необходимости установи Android SDK Platform 35.
4. В меню Build выбери Build Bundle(s) / APK(s) → Build APK(s).
5. APK будет в app/build/outputs/apk/debug/app-debug.apk.

Важно: этот архив — исходный проект, а не уже собранный APK. Здесь я не смог собрать и протестировать APK на устройстве. Игра не требует интернета после установки.

Первое приложение должно бесконечно генерировать случайные слова (длина не более 100 символов) и отправлять их в очередь в Kafka в формате JSON (например, { "word": "nsjeitnfbsnsk" }). Таймаут между отправками должен настраиваться через конфигурационный файл (подразумевается, что отправляется по одному слову за раз).

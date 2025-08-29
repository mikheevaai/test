## Описание проверки
**Релиз:**
**ID:** S_ONEC_013
**Язык:** 1С
**Критичность:** ERROR
**Категория:** 

### Название 
Соединение с внешним HTTP-сервером
### Описание 
Проверка «Соединение с внешним HTTP-сервером» выявляет случаи использования в программном коде системы «1С:Предприятие» прямого соединения с внешним HTTP-сервером (минуя сервер приложения).

### Угрозы 
- Внедрение backdoor третьей стороной (в аутсорс проектах).
### Рекоммендации 
- Проведите «ручной» анализ результатов проверки на целесообразность использования прямого соединения с внешним HTTP-сервером.
### Пример 
``` 
&НаКлиенте
Процедура СоздатьЗаданиеПланировщика()
	Соединение = Новый HTTPСоединение("www.mysite.ru");
КонецПроцедуры
``` 
### Ссылки
- [CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:C/C:H/I:H/A:H/E:H/RC:C = 10](https://www.first.org/cvss/calculator/3.1#CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:C/C:H/I:H/A:H/E:H/RC:C)
- [OWASP TOP-10 A08_2021](https://owasp.org/Top10/A08_2021-Software_and_Data_Integrity_Failures/)
- [OWASP TOP-10 A05_2021](https://owasp.org/Top10/A05_2021-Security_Misconfiguration/)
- [MITRE CWE 611](https://cwe.mitre.org/data/definitions/611.html)
- [MITRE CWE 669](https://cwe.mitre.org/data/definitions/669.html)
- [MITRE CWE-829](https://cwe.mitre.org/data/definitions/829.html)

---
## Примечание

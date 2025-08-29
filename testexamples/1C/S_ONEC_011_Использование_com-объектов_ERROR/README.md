## Описание проверки
**Релиз:**
**ID:** S_ONEC_011
**Язык:** 1С
**Критичность:** ERROR
**Категория:** 

### Название 
Использование com-объектов
### Описание 
Проверка «Использование com-объектов» выявляет наличие в программном коде системы «1С:Предприятие» вызова com-объектов с помощью конструктора «ПолучитьCOMОбъект(…)».

### Угрозы 
- Внедрение backdoor третьей стороной (в аутсорс проектах).
### Рекоммендации 
- Проведите «ручной» анализ результатов проверки на целесообразность использования вызова com-объектов в программном коде системы «1С:Предприятие».
### Пример 
``` 
&НаКлиенте
Процедура СоздатьЗаданиеПланировщика()
	ServicesSet = ПолучитьCOMОбъект(
		"winmgmts:{impersonationLevel=impersonate}!" + ИмяКомпьютера + "\\root\\cimv2");
	ObjectSet = ПолучитьCOMОбъект("WinMgmts:Win32_ScheduledJob");
	Connection = Новый COMОбъект("ADODB.Connection")
КонецПроцедуры
``` 
### Ссылки
- [CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:C/C:H/I:H/A:H/E:H/RC:C = 10](https://www.first.org/cvss/calculator/3.1#CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:C/C:H/I:H/A:H/E:H/RC:C)
- [OWASP TOP-10 A03_2021](https://owasp.org/Top10/A03_2021-Injection/)
- [MITRE CWE-94](https://cwe.mitre.org/data/definitions/94.html)
- [MITRE CWE-643](https://cwe.mitre.org/data/definitions/643.html)
- [MITRE CWE 915](https://cwe.mitre.org/data/definitions/915.html)

---
## Примечание

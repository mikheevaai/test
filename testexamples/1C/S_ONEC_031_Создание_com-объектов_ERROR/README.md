## Описание проверки
**Релиз:**
**ID:** S_ONEC_031
**Язык:** 1С
**Критичность:** ERROR
**Категория:** 

### Название 
Создание com-объектов
### Описание 
Проверка «Создание com-объектов» выявляет наличие в программном коде системы «1С:Предприятие» вызова com-объектов с помощью конструктора «Новый COMОбъект(…)».

### Угрозы 
- Внедрение backdoor третьей стороной (в аутсорс проектах).
### Рекоммендации 
- Проведите «ручной» анализ результатов проверки на целесообразность использования вызова com-объектов в программном коде системы «1С:Предприятие».
### Пример 
``` 
&НаКлиенте
Процедура СоздатьЗаданиеПланировщика()
	ServicesSet = ПолучитьCOMОбъект(
			"winmgmts:{impersonationLevel=impersonate}!"
			+ ИмяКомпьютера + "\\root\\cimv2\");
	ObjectSet = ПолучитьCOMОбъект("WinMgmts:Win32_ScheduledJob");
	Connection = Новый COMОбъект("ADODB.Connection");
КонецПроцедуры
``` 
### Ссылки
- [CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:C/C:H/I:H/A:H/E:H/RC:C = 10](https://www.first.org/cvss/calculator/3.1#CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:C/C:H/I:H/A:H/E:H/RC:C)
- [MITRE CWE-78](https://cwe.mitre.org/data/definitions/78.html)
- [MITRE CWE-250](https://cwe.mitre.org/data/definitions/250.html)
- [MITRE CWE-284](https://cwe.mitre.org/data/definitions/284.html)

---
## Примечание

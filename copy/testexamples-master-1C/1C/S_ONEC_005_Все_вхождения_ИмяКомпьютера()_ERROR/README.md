## Описание проверки
**Релиз:**
**ID:** S_ONEC_005
**Язык:** 1С
**Критичность:** ERROR
**Категория:** 

### Название 
Все вхождения ИмяКомпьютера()
### Описание 
Проверка «Все вхождения ИмяКомпьютера()» выявляет случаи использования в программном коде системы «1С:Предприятие» функции «ИмяКомпьютера()». Данная функция возвращает в программу сетевое имя компьютера, на котором был исполнен участок кода.

### Угрозы 
- Обход системы авторизации.
### Рекоммендации 
- Проведите «ручной» анализ результатов проверки для определения степени критичности участков кода, в которых используется функция «ИмяКомпьютера()».
### Пример 
``` 
Функция ОбновитьРабочееМестоКлиента() Результат = ИмяКомпьютера();
	Возврат Результат;
КонецФункции
``` 
### Ссылки
- [CVSS:3.1/AV:N/AC:L/PR:L/UI:N/S:C/C:H/I:H/A:H/E:H/RC:C/CR:H/IR:H/AR:H = 9.9](https://www.first.org/cvss/calculator/3.1#CVSS:3.1/AV:N/AC:L/PR:L/UI:N/S:C/C:H/I:H/A:H/E:H/RC:C/CR:H/IR:H/AR:H)
- [OWASP TOP-10 A01_2021](https://owasp.org/Top10/A01_2021-Broken_Access_Control/)
- [OWASP TOP-10 A07_2021](https://owasp.org/Top10/A07_2021-Identification_and_Authentication_Failures/)
- [MITRE CWE-94](https://cwe.mitre.org/data/definitions/94.html)
- [MITRE CWE-201](https://cwe.mitre.org/data/definitions/201.html)
- [MITRE CWE-276](https://cwe.mitre.org/data/definitions/276.html)
- [MITRE CWE-352](https://cwe.mitre.org/data/definitions/352.html)
- [MITRE CWE-497](https://cwe.mitre.org/data/definitions/497.html)
- [MITRE CWE-676](https://cwe.mitre.org/data/definitions/676.html)

---
## Примечание

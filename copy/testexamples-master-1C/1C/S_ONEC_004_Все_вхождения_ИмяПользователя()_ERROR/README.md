## Описание проверки
**Релиз:**
**ID:** S_ONEC_004
**Язык:** 1С
**Критичность:** ERROR
**Категория:** 

### Название 
Все вхождения ИмяПользователя()
### Описание 
Проверка «Все вхождения «ИмяПользователя()» выявляет случаи использования в программном коде системы «1С:Предприятие» функции «ИмяПользователя()». Данная функция возвращает в программу имя пользователя, указанное при запуске программы.

### Угрозы 
- Обход концепции ролей и полномочий.
### Рекоммендации 
- Проведите «ручной» анализ результатов проверки для определения степени критичности участков кода, в которых используется функция «ИмяПользователя()».
### Пример 
``` 
Функция ОбновитьРабочееМестоКлиента() результат = ИмяПользователя();
	Возврат Результат;
КонецФункции
``` 
### Ссылки
- [CVSS:3.1/AV:N/AC:L/PR:L/UI:N/S:C/C:H/I:H/A:H/E:H/RC:C/CR:H/IR:H/AR:H = 9.9](https://www.first.org/cvss/calculator/3.1#CVSS:3.1/AV:N/AC:L/PR:L/UI:N/S:C/C:H/I:H/A:H/E:H/RC:C/CR:H/IR:H/AR:H)
- [OWASP TOP-10 A01_2021](https://owasp.org/Top10/A01_2021-Broken_Access_Control/)
- [MITRE CWE-201](https://cwe.mitre.org/data/definitions/201.html)
- [MITRE CWE-276](https://cwe.mitre.org/data/definitions/276.html)
- [MITRE CWE-352](https://cwe.mitre.org/data/definitions/352.html)
- [MITRE CWE-359](https://cwe.mitre.org/data/definitions/359.html)
- [MITRE CWE-676](https://cwe.mitre.org/data/definitions/676.html)
- [OWASP API Security TOP-10 2019](https://owasp.org/API-Security/editions/2019/ru/dist/owasp-api-security-top-10.pdf)

---
## Примечание 

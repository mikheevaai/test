## Описание проверки
**Релиз:**
**ID:** S_ONEC_021
**Язык:** 1С
**Критичность:** ERROR
**Категория:** 

### Название 
Явно заданное значение пароля
### Описание 
Проверка «Явно заданное значение пароля» выявляет наличие в программном коде системы «1С:Предприятие» фрагмента кода с жёстко запрограммированным значением пароля с дальнейшим использованием. Если код поставляется в виде исходного кода, любая жёстко запрограммированная информация может быть считана (передана или опубликована) любым пользователем с правами на доступ к исходному коду. Жестко закодированные пароли – это недостаток построения программы.

### Угрозы 
- Доступ к опубликованным парольным данным в программном коде;
- Увеличение привилегий на систему.
### Рекоммендации 
- Удалите из кода все экземпляры явно заданных значений паролей.
### Пример 
``` 
Процедура OpenSMTPConnection()
	Профиль = Новый ИнтернетПочтовыйПрофиль;
	Профиль.АдресСервераSMTP = "smtp.yandex.ru\";
	Профиль.ПользовательSMTP = "111\";
	Профиль.ПарольSMTP = "222222\";
	Профиль.АутентификацияSMTP = СпособSMTPАутентификации.Login;
КонецПроцедуры
``` 
### Ссылки
- [CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:C/C:H/I:H/A:H/E:H/RC:C = 10](https://www.first.org/cvss/calculator/3.1#CVSS:3.1/AV:N/AC:L/PR:N/UI:N/S:C/C:H/I:H/A:H/E:H/RC:C)
- [OWASP TOP-10 A07_2021](https://owasp.org/Top10/A07_2021-Identification_and_Authentication_Failures/)
- [MITRE CWE-256](https://cwe.mitre.org/data/definitions/256.html)
- [MITRE CWE-259](https://cwe.mitre.org/data/definitions/259.html)
- [MITRE CWE-729](https://cwe.mitre.org/data/definitions/729.html)
- [MITRE CWE-798](https://cwe.mitre.org/data/definitions/798.html)
- [OWASP WWW-Community](https://github.com/OWASP/www-community/blob/master/pages/vulnerabilities/Password_Management_Hardcoded_Password.md)

---
## Примечание 

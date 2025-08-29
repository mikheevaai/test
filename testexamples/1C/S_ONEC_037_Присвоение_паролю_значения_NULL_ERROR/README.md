## Описание проверки
**Релиз:**
**ID:** S_ONEC_037
**Язык:** 1С
**Критичность:** ERROR
**Категория:** 

### Название 
Присвоение паролю значения NULL
### Описание 
Присваивание значения NULL переменным, отвечающим за пароль, может позволить злоумышленникам обойти проверку пароля или может означать, что ресурсы защищены пустым паролем.

### Угрозы 
- Компрометации информации;
- Повышение привилегий в системе.
### Рекоммендации 
- Используйте непустые пароли.
- Если заданный в исходном коде пароль используется для первого входа в систему, предусмотрите для этой цели специальный режим аутентификации, при котором пользователь обязан предоставить собственный уникальный пароль.
### Пример 
``` 
Пароль = NULL;

Если !((ПарольПользователя = getPassword(Пароль)) = null) Тогда
	Пароль = ПарольПользователя;
КонецЕсли;
``` 
### Ссылки
- [CVSS:3.1/AV:N/AC:L/PR:L/UI:N/S:C/C:H/I:H/A:H/E:H/RC:C/CR:H/IR:H/AR:H = 9.9](https://www.first.org/cvss/calculator/3.1#CVSS:3.1/AV:N/AC:L/PR:L/UI:N/S:C/C:H/I:H/A:H/E:H/RC:C/CR:H/IR:H/AR:H)
- [OWASP Authentication_Cheat_Sheet](https://cheatsheetseries.owasp.org/cheatsheets/Authentication_Cheat_Sheet.html)
- [MITRE CWE-258](https://cwe.mitre.org/data/definitions/258.html)
- [MITRE CWE-259](https://cwe.mitre.org/data/definitions/259.html)
- [MITRE CWE-306](https://cwe.mitre.org/data/definitions/306.html)
- [MITRE CWE-522](https://cwe.mitre.org/data/definitions/522.html)

---
## Примечание

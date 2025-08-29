//-- WindowsScriptHostUsage
Функция ПроверитьСпособДоставки(Рассылка, Знач ПараметрыДоставки) Экспорт
    Попытка
        // Создание com-объекта
        // S_ONEC_030 Использование методов объекта WScript.Shell и Shell.Application компоненты Windows Script Host операционной системы x1
        // S_ONEC_031 Создание com-объектов x1
        ShellApplication = Новый COMОбъект("Shell.Application");
        ShellApplication.SetTime();
    Исключение
        ПараметрыЖурнала.Вставить("Данные",  Рассылка);
    КонецПопытки;

    Возврат ПараметрыЖурнала;
КонецФункции
//== WindowsScriptHostUsage
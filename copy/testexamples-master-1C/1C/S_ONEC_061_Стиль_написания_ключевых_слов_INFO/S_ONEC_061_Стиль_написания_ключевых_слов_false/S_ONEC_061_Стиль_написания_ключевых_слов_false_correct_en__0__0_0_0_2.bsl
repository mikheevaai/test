Procedure ПроверкаСтиля()

    Value = False;

    // S_ONEC_054 Отсутствие конструкции «Иначе» в условном операторе x1
    // S_ONEC_035 Сравнение с булевым литералом x1
    If Value <> False Then
        Обработать();
    ElsIf False Then
        Обработать();
    EndIf;

    ПроверитьЗначение(False);

EndProcedure

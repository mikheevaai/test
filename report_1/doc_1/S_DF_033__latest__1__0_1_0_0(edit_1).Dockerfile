FROM baseImage
# S_DF_033 Базовый образ latest x1
COPY --from=nginx:latest /a test
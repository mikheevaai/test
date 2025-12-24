FROM baseImage

# S_DF_001 Использование «cd» вместо инструкции «WORKDIR» x1
RUN cd /app/bin && ./start.sh
# S_DF_001 Использование «cd» вместо инструкции «WORKDIR» x1
RUN ["cd", "/app/bin", "&&", "./start.sh"]
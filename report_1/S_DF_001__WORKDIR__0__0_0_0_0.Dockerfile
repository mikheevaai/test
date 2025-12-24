FROM baseImage

# S_DF_001 Использование «cd» вместо инструкции «WORKDIR» x0
WORKDIR /app/bin
RUN ./start.sh

# S_DF_001 Использование «cd» вместо инструкции «WORKDIR» x0
RUN /app/bin/start.sh
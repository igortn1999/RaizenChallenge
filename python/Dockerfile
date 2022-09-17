FROM python:3

WORKDIR /usr/src/graphapp

COPY requirements.txt ./
RUN pip install --no-cache-dir -r requirements.txt

COPY . .

CMD [ "python", "./graph.py" ]

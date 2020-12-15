package by.tc.task01.main;

import java.util.Objects;

public class BaseTable {
    public BaseTable(String shares) {
    }


// Базовый класс модели, имеющий ключ id

  
    public class BaseModel {
        protected long id;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public BaseModel() {
        }

        public BaseModel(long id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BaseTable.BaseModel baseModel = (BaseTable.BaseModel) o;
            return id == baseModel.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

    }
}

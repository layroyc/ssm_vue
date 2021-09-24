package com.hp.bean;

import java.io.Serializable;

/**
 * component
 * @author 
 */
public class Component implements Serializable {
    private Integer componentId;

    private Integer typeId;

    private String componentName;

    private String capacity;

    private Integer price;


    private static final long serialVersionUID = 1L;

    public Integer getComponentId() {
        return componentId;
    }

    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Component other = (Component) that;
        return (this.getComponentId() == null ? other.getComponentId() == null : this.getComponentId().equals(other.getComponentId()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getComponentName() == null ? other.getComponentName() == null : this.getComponentName().equals(other.getComponentName()))
            && (this.getCapacity() == null ? other.getCapacity() == null : this.getCapacity().equals(other.getCapacity()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getComponentId() == null) ? 0 : getComponentId().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        result = prime * result + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Component{" +
                "componentId=" + componentId +
                ", typeId=" + typeId +
                ", componentName='" + componentName + '\'' +
                ", capacity='" + capacity + '\'' +
                ", price=" + price +
                '}';
    }
}
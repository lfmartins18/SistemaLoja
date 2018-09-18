package ifal.edu.tarde.br.SistemaLoja.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ItemCarrinho {

	@Id
	@GeneratedValue 
	private Integer id;

	private Double valorProduto;
	private Integer quantProduto;

	public ItemCarrinho() {
	 super();
	}
	public Double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(Double valorProduto) {
		this.valorProduto = valorProduto;
	}
	public Integer getQuantProduto() {
		return quantProduto;
	}
	public void setQuantProduto(Integer quantProduto) {
		this.quantProduto = quantProduto;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemCarrinho other = (ItemCarrinho) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}

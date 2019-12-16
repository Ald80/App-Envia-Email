<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="modal.jsp"/>
	<div style="margin-top:60px;" align="center" class="container col-6">
		<form action="EmailServlet" method="post">
			<div class="form-group row">
				<label for="emailDe" class="col-sm-1 col-form-label">De:</label>
				<div class="col-sm-9">
					<input type="email" class="form-control" id="emailDe" name="txtDe"  size="30">
				</div>
			</div>
			<div class="form-group row">
				<label for="emailPara" class="col-sm-1 col-form-label">Para:</label>
				<div class="col-sm-9">
					<input type="email" class="form-control" id="emailPara" name="txtPara" size="30">
				</div>
			</div>
			<div class="form-group row">
				<label for="tituloEmail" class="col-sm-1 col-form-label">Titulo:</label>
				<div class="col-sm-9">
					<input type="text" class="form-control" id="tituloEmail" name="txtTitulo" size="30" required>
				</div>
			</div>
			<div class="form-group row">
				<label for="senhaEmail" class="col-sm-1 col-form-label">Senha:</label>
				<div class="col-sm-9">
					<input type="password" class="form-control" id="senhaEmail" name="txtSenha" size="20" required>
				</div>			
			</div>
			<div class="form-group row" style="padding:7px 15px;">
				<label for="mensagemEmail" class=" col-form-label">Mensagem:</label>
				<textarea name="txtCorpo" class="form-control" id="mensagemEmail" rows="3" required></textarea>		
			</div>
			<div>
				<button style="margin-top:15px;" class="bg-dark mb-2 col-lg-2 btn btn-primary" type="submit" >Enviar</button>
			</div>
		</form>
	</div>
